package com.thilaka.array.a.attempt;

public class Array {

    private int[] array;
    private int currentIndex;
    private int arrayLength;

    Array(int length) {
        this.array = new int[length];
        this.currentIndex = 0;
        this.arrayLength = length;
    }

    public void insert(int item) {
        if (null == this.array)
            return;
        if (this.currentIndex < this.arrayLength) {
            this.array[this.currentIndex++] = item;
        } else {
            int[] arrayNew = new int[this.arrayLength + 1];
            for (int i = 0; i < this.arrayLength; i++) {
                arrayNew[i] = this.array[i];
            }
            arrayNew[this.arrayLength] = item;
            this.array = arrayNew;
            this.arrayLength++;
            this.currentIndex++;
        }
    }

    public void removeAt(int index) {
        if (null == this.array || index >= this.currentIndex)
            return;
        int[] arrayNew = new int[this.arrayLength-1];
        for(int i=0; i<index;i++){
            arrayNew[i] = this.array[i];
        }
        for(int i=index+1;i<this.arrayLength;i++){
            arrayNew[i-1] = this.array[i];
        }
        this.array = arrayNew;
        this.arrayLength--;
    }

    public int indexOf(int num) {
        if(null == array || num >= this.currentIndex)
            return -1;
        return this.array[num];
    }

    public void print() {
        if (null == array)
            return;
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
