package com.algods.aniruddha.arrays;

public class RevArray {
        public int[] array;


        public RevArray(int[] array){
            this.array = array;
        }

        // Getters
        public int[] getArray(){
            return this.array;

        }

        // Setter
        public void setArray(int[] array) {
            this.array = array;
        }

        public void printArray(int[] arr){
            String printarr = "{";
            for(int i = 0; i<4; i++){
                printarr =  printarr + array[i] + ", ";
            }
            printarr = printarr +"} ";
            System.out.println(printarr);
        }


        // function to reverse the array
        public void reverse(){
            int[] newArray = new int[this.array.length];
            for(int i = this.array.length-1; i >=0 ; i--){
                newArray[3-i] = this.array[i];
                System.out.println(this.array[i]);

            }

            printArray(newArray);

            for(int i = 0; i <4 ; i++){
                this.array[i] = newArray[i];

            }
            printArray(this.array);


            // return this.array;

        }


    }


