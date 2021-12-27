package com.company;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // удаляем из пустого стека
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        // ищем в пустом стеке
        try {
            System.out.println(stack.search(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        // добавляем в заполненный стек
        try {
            for (int i = 0; i < 11; i++) {
                stack.push(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        // ищем в не пустом стеке элемент который есть
        try {
            System.out.println(stack.search(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }
        System.out.println();

        // ищем в не пустом стеке элемент которого нет
        try {
            System.out.println(stack.search(10));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(stack);
        }

    }
}