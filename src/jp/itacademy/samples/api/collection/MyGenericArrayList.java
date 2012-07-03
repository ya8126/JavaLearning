package jp.itacademy.samples.api.collection;

public class MyGenericArrayList<T> {
	private int array_size = 3;
	private int data_size = 0;
	private Object[] array = new Object[array_size];

	public int add(T s) {
		if (array_size == data_size) {
			array_size += 3;
			Object[] new_array = new Object[array_size];
			System.arraycopy(array, 0, new_array, 0, array.length);
			array = new_array;
		}
		array[data_size++] = s;

		return data_size;
	}

	public T get(int index) {
		if (index >= data_size)
			return null;

		return array[index];
	}

	public int size() {
		return data_size;
	}

	public int remove(int index){
		if (index >= data_size)
			return -1;

		if (index == data_size - 1)
			return --data_size;

		System.arraycopy(array, index + 1, array, index, data_size - index - 1);
		return --data_size;
	}
}
