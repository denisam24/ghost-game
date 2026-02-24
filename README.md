========================
= Descriere generală   =
========================

Proiectul simuleaza o harta bidimensională. Jucătorul se deplasează conform unui set de instrucțiuni, iar fantomele se mișcă automat pe baza unor reguli prestabilite.
Mai întâi sunt aplicate mutările jucătorului, apoi sunt simulate mișcările fantomelor. După fiecare pas se verifică dacă apare o coliziune între jucător și o fantomă.

==========================================================
= Structura proiectului și separarea fișierelor          =
==========================================================

Aplicația este împărțită în mai multe clase:

    - Main -> Creeaza obiectul Game și coordonează execuția generală.

    - Game -> Gestionează starea jocului și implementează logica principală a simulării.

    - Ghost -> Modelează o fantomă. Conține coordonatele acesteia și logica de deplasare.


========================
=     Implementare     =
========================

- Harta este modelată prin coordonate (x, y), iar pozițiile sunt actualizate treptat, în funcție de mutările jucătorului și ale fantomelor.

- Mai intai sunt executate toate mutarile jucatorului înainte de începerea simulării fantomelor.Ulterior, sunt actualizate pozițiile fantomelor.

- Fantomele se mișcă pe o singură axă: cele verticale pe axa X, iar cele orizontale pe axa Y.

- La final sunt afișate coordonatele jucătorului și ale fantomelor.
