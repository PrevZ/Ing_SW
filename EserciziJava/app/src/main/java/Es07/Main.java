package main.java.Es07;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Framework di Ordinamento Es07 ===\n");
        
        // Creo una collezione ordinata con QuickSorter di default
        System.out.println("1. Creazione SortedCollection con QuickSorter:");
        SortedCollection collection1 = new SortedCollection();
        
        // Dimostro le operazioni della collezione
        System.out.println("\n2. Operazioni della collezione:");
        collection1.add();
        collection1.get();
        collection1.remove();
        
        // Dimostro le operazioni di ordinamento
        System.out.println("\n3. Operazioni di ordinamento (Sortable):");
        collection1.compare();
        collection1.swap();
        System.out.println("Numero di elementi: " + collection1.count());
        
        // Eseguo l'ordinamento con QuickSorter
        System.out.println("\n4. Ordinamento con QuickSorter:");
        collection1.sort();
        
        // Creo un'altra collezione per dimostrare il polimorfismo
        System.out.println("\n5. Test con diversi algoritmi di ordinamento:");
        
        // Test QuickSorter diretto
        Sorter quickSorter = new QuickSorter();
        System.out.print("QuickSorter diretto: ");
        quickSorter.sort();
        
        // Test HyperSorter diretto
        Sorter hyperSorter = new HyperSorter();
        System.out.print("HyperSorter diretto: ");
        hyperSorter.sort();
        
        // Dimostro il pattern Strategy
        System.out.println("\n6. Dimostrazione Pattern Strategy:");
        Sorter[] sorters = {new QuickSorter(), new HyperSorter()};
        
        for (int i = 0; i < sorters.length; i++) {
            System.out.print("Algoritmo " + (i + 1) + ": ");
            sorters[i].sort();
        }
        
        System.out.println("\n=== Fine dimostrazione ===");
    }
}
