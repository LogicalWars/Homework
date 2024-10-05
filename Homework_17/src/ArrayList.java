import inno.*;

public class ArrayList<T> implements List<T> {

    private final static int DEFAULT_ARRAY_SIZE = 10;

    // поле-массив, которое хранит все элементы
    private T[] elements;

    // поле, котороые хранит число элементов
    private int count;

    public ArrayList() {
        this.elements = (T[]) new Object[DEFAULT_ARRAY_SIZE];
        this.count = 0;
    }

    @Override
    public void add(T element) {
        // если массив заполнен
        if (isFull()) {
            // изменяем его размер
            resize();
        }
        elements[count] = element;
        count++;
    }

    private void resize() {
        // берем старый размер массива
        int currentLength = elements.length;
        // получаем значение, в полтора раза больше предыдыщуего размерf
        // это и будет новый массив
        int newLength = currentLength + currentLength / 2;
        // создали новый массив бОльшего размера
        T[] newElements = (T[]) new Object[newLength];
        // последовательно копируем элементы
        for (int i = 0; i < count; i++) {
            newElements[i] = elements[i];
        }
        // переключить ссылку на новый массив
        this.elements = newElements;
    }

    private boolean isFull() {
        return count == elements.length;
    }


    @Override
    public boolean contains(T element) {
        // пробегаем все элементы
        for (int i = 0; i < count; i++) {
            // если элемент найден
            if (elements[i].equals(element)) {
                return true;
            }
        }
        // если элемент так и не был найден - возвращаем false
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void removeAt(int index) {
        if (index >= 0 && index < count) {
            for (int i = index; i < count; i++) {
                elements[i] = elements[i+1];
            }
            count--;
        }
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                removeAt(i);
                break;
            }
        }
    }

    @Override
    public T get(int index) {
        if (index >= 0 && index < count) {
            return elements[index];
        }
        return null;
    }
}
