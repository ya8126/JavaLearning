package jp.itacademy.samples.api.collection;

import java.util.Iterator;

public class MyGenericArrayList<T> implements Iterable<T> {
	private int array_size = 3;
	private int data_size = 0;
	private Object[] array = new Object[array_size];

	public Iterator iterator() {
		return new myIterator();
	}

	private class myIterator<E> implements Iterator<E> {

		private int cursor = 0;
		private int readed = -1;

		@Override
		public boolean hasNext() {
			if (cursor >= MyGenericArrayList.this.data_size)
				return false;

			return true;
		}

		@Override
		public E next() {
			if (!hasNext())
				return null;

			readed = cursor;
			return (E) array[cursor++];
		}

		@Override
		public void remove() {
			if (readed < 0)
				return;

			MyGenericArrayList.this.remove(readed);
			readed = -1;
			cursor--;
		}

	}

	public int add(T e) {
		if (array_size == data_size) {
			array_size += 3;
			Object[] new_array = new Object[array_size];
			System.arraycopy(array, 0, new_array, 0, array.length);
			array = new_array;
		}
		array[data_size++] = e;

		return data_size;
	}

	public T get(int index) {
		if (index >= data_size)
			return null;

		return (T) array[index];
	}

	public int size() {
		return data_size;
	}

	public int remove(int index) {
		if (index >= data_size)
			return -1;

		if (index == data_size - 1)
			return --data_size;

		System.arraycopy(array, index + 1, array, index, data_size - index - 1);
		return --data_size;
	}

}
