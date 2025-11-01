package linkedList;

// 📦 Package not necessary unless you’re using one — you can skip this line
// package linkedList;

import java.util.*;   // Import the java.util package (for Scanner and LinkedList)

public class BuiltInLinkedListDemo {
    public static void main(String[] args) {
        // 🔹 Create a LinkedList of Integers
        LinkedList<Integer> list = new LinkedList<>();

        // 🔹 Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // -------------------------------
        // 🔸 Step 1: Take input from user
        // -------------------------------
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();  // number of elements user wants to add

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.add(val);  // adds element at the end
        }

        // -------------------------------
        // 🔸 Step 2: Display the list
        // -------------------------------
        System.out.println("\nInitial LinkedList: " + list);

        // -------------------------------
        // 🔸 Step 3: Demonstrate common LinkedList functions
        // -------------------------------

        // 1️⃣ Add element at the beginning
        list.addFirst(100);
        System.out.println("After addFirst(100): " + list);

        // 2️⃣ Add element at the end
        list.addLast(200);
        System.out.println("After addLast(200): " + list);

        // 3️⃣ Add element at a specific index (e.g., index 2)
        list.add(2, 50);
        System.out.println("After add(2, 50): " + list);

        // 4️⃣ Remove first element
        list.removeFirst();
        System.out.println("After removeFirst(): " + list);

        // 5️⃣ Remove last element
        list.removeLast();
        System.out.println("After removeLast(): " + list);

        // 6️⃣ Remove element by index
        list.remove(1);
        System.out.println("After remove(1): " + list);

        // 7️⃣ Get first and last elements (without removing)
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // 8️⃣ Get element at specific index
        System.out.println("Element at index 1: " + list.get(1));

        // 9️⃣ Check if list contains a value
        System.out.println("Does list contain 50? " + list.contains(50));

        // 🔟 Size of the list
        System.out.println("Size of list: " + list.size());

        // 1️⃣1️⃣ Replace (set) element at specific index
        list.set(0, 999);
        System.out.println("After set(0, 999): " + list);

        // 1️⃣2️⃣ Peek (view head element without removing)
        System.out.println("Peek (head element): " + list.peek());

        // 1️⃣3️⃣ Poll (retrieve and remove head element)
        System.out.println("Poll (remove head): " + list.poll());
        System.out.println("After poll(): " + list);

        // 1️⃣4️⃣ Reverse iteration using descendingIterator()
        System.out.print("Reverse order: ");
        Iterator<Integer> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // -------------------------------
        // 🔸 Step 4: Clear the list
        // -------------------------------
        list.clear();
        System.out.println("After clear(): " + list);

        // Close the scanner
        sc.close();
    }
}
