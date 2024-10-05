import inno.*;

public class LinkedList<T> implements List<T> {

    private Node<T> first;

    private Node<T> last;
    private int count;

    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value) {
            this.value = value;
        }
    }

    @Override
    public void add(T element) {
        // создаем новый узел со значением
        Node<T> newNode = new Node<>(element);
        // если элементов в списке нет
        if (count == 0) {
            // кладем новый узел в качестве первого и последнего
            this.first = newNode;
        } else {
            // если в списке уже есть узлы
            // у последнего делаем следующим новый узел
            this.last.next = newNode;
        }
        this.last = newNode;
        count++;
    }

    @Override
    public boolean contains(T element) {
        // получить ссылку на первый элемент списка
        // пройтись по всем элементам списка
        Node<T> current = this.first;
        // пока не обошли весь список
        while (current != null) {
            // если значение в текущем узле совпало с искомым
            if (current.value.equals(element)) {
                return true;
            }
            // если не совпало - идем к следующему узлу
            current = current.next;
        }
        // если не нашли элемент
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void removeAt(int index) {
        if (0 <= index && index <= count) {
            Node<T> current = this.first;
            Node<T> delElement = null;
            if (index != 0) {
                for (int i = 0; i < index; i++) {
                    if (i < index - 1) {
                        current = current.next;
                    } else {
                        delElement = current.next;
                    }
                }
                if (index != count) {
                    current.next = delElement.next;
                } else {
                    current.next = null;
                }
                count--;
                if (index == count) {
                    this.last = current;
                }
            } else {
                this.first = this.first.next;
                count--;
            }
        }
    }

    @Override
    public void remove(T element) {
        Node<T> current = this.first;
        for (int i = 0; i < count; i++) {
            if(current.value.equals(element)) {
                removeAt(i);
                break;
            }
            current = current.next;
        }
    }

    @Override
    public T get(int index) {
        if (0 <= index && index <= count) {
            // начинаем с первого элемента
            Node<T> current = this.first;

            // если запрошенный индекс был равен - 3
            // 0, 1, 2
            for (int i = 0; i < index; i++) {
                // на каждом шаге цикла двигаемся дальше
                current = current.next;
            }
            return current.value;
        }
        return null;

    }
}
