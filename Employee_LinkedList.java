package Linked_List;

import Sorting.employee;

public class Employee_LinkedList {

	private EmpNode head;

	public Employee_LinkedList() {
		head = null;
	}

	public void insert_at_first(Employee E) {
		EmpNode new_node = new EmpNode(E);
		if (head == null) {
			head = new_node;
			return;

		}
		new_node.setNext(head);
		head = new_node;
		return;
	}

	public void insert_at_last(Employee E) {

		EmpNode new_node = new EmpNode(E);

		if (head == null) {
			head = new_node;
			return;
		}
		EmpNode iter = head;
		while (iter.getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(new_node);
		return;
	}

	public void insert_by_pos(Employee E, int pos) {

		EmpNode new_node = new EmpNode(E);
		int i;
		if (head == null) {
			head = new_node;
			return;

		}
		if (pos == 1) {
			new_node.setNext(head);
			head = new_node;
			return;
		}
		EmpNode iter = head;
		for (i = 0; i < pos - 1 && iter.getNext() != null; i++) {

			iter = iter.getNext();

		}
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;

	}

	public void Display() {

		if (head == null) {
			System.out.println("Your LL is empty !!! ");
			return;
		}

		EmpNode iter = head;
		while (iter != null) {
			System.out.println(iter.getData());
			iter = iter.getNext();
		}
		return;
	}

	public Employee delete_first() {

		EmpNode deletable;
		Employee d;
		if (head == null) {
			System.out.println("\n My list is Empty : ");
			return null;
		}
		deletable = head;
		head = head.getNext();
		d = deletable.getData();
		deletable = null;
		return d;
	}

	public Employee delete_last() {

		EmpNode delatable;
		Employee d;

		if (head == null) {
			System.out.println("\n list is Empty !! ");
			return null;
		}
		if (head.getNext() == null) {

			d = head.getData();
			delatable = head;
			head = null;
			delatable = null;
			return d;
		}
		EmpNode iter = head;
		while (iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}

		delatable = iter.getNext();
		d = delatable.getData();
		iter.setNext(null);
		delatable = null;

		return d;
	}

	public Employee delete_by_pos(int pos) {
		int i;
		EmpNode iter;
		EmpNode deletable;
		Employee d;
		if (head == null) {
			System.out.println("\n list is empty !! ");
		}
		if (pos == -1) {
			deletable = head;
			head = head.getNext();
			d = deletable.getData();
			deletable = null;
			return d;

		}
		if (head.getNext() == null) {
			System.out.println("\n invalid position ");
			return null;
		}

		for (i = 1, iter = head; i < pos - 1 && iter.getNext() != null; i++, iter = iter.getNext())
			;

		if (iter.getNext() == null) {
			System.out.println("\n invalid postion ");
			return null;
		}

		deletable = iter.getNext();
		d = deletable.getData();
		iter.setNext(deletable.getNext());

		return d;
	}

	public void inseret_sord(Employee E) {

		EmpNode new_node = new EmpNode(E);

		if ((head == null) || (E.getId() < head.getData().getId())) {

			new_node.setNext(head);
			head = new_node;
			return;

		}

		EmpNode iter = head;
		while ((iter.getNext() != null) && (E.getId() < iter.getNext().getData().getId())) {

			iter = iter.getNext();
		}
		new_node.setNext(iter.getNext());
		iter.setNext(new_node);
		return;
	}

	public void Reverse() {

		EmpNode prev, iter, next;
		prev = null;
		iter = head;
		while (iter != null) {
			next = iter.getNext();
			iter.setNext(prev);
			prev = iter;
			iter = next;

		}
		head = prev;

	}
}
