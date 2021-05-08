package com.thread.work;


  
  class multithreading  implements Runnable {
		public void run() {
		System.out.println("In run method; thread name is: " +
		Thread.currentThread().getName());
		}
		public void main(String args[]) throws Exception {
		Thread myThread = new Thread(new multithreading());
		myThread.start();
		System.out.println("In main method; thread name is: " +
		Thread.currentThread().getName());
		}
		}

