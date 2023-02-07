package org.example;

/*
--------------------------------------------------------------------------------
TERVEZO:

az edzestervezo konzolon beker egy edzesszamot az adott hetre
megkerdezi van-e nap amit szeretnenk kihagyni mas program/piheno miatt
lehetoseg legyen random generaltatni, illetve napokra lebontani
Mapban visszaadja a het napjait, illetve a gyakorlatokat is stringben/listaban
egy heten egymasutan nem lehet 2 egyforma edzes(cardiora nem ervenyes!)
egy edzesben nem lehet 2 egyforma gyakorlat
--------------------------------------------------------------------------------
EDZES:

minden tipushoz tartozik egy gyakorlatlista
minden gyakorlathoz tartozik egy int ido es egy int elegetett kaloria
egy edzes 5 gyakorlatbol all
--------------------------------------------------------------------------------
FILE:

szoveges formatumban menti egy fileba a kesz tervet
a lenti formatumban irja ki a het napjait

    Hetfo:
        - combfeszito
        - terdhajlito
        - ulovadli
        - guggolas
        - allovadli
--------------------------------------------------------------------------------
DB:

kesobb megoldani, hogy az edzestipusokhoz tartozo gyakorlatokat adatbazisbol kerje le a program
--------------------------------------------------------------------------------
WEB:

esetleg egy weboldalt is felhuzni ha megvan minden korabbi, sajat profillal, adatbazissal
--------------------------------------------------------------------------------
Listak:

Cardio:
    - futas
    - evezes
    - lepcsozes
    - biciklizes
    - ugralokotelezes

Brosplit:
    - mell:
        - fekvenyomas
        - tarogatas
        - pullover
        - negativ fekvenyomas
        - pozitiv fekvenyomas
    - hat:
        - lehuzas szelesen
        - lehuzas keskenyen
        - szembol huzas keskenyen
        - szembol huzas szelesen
        - hiperhajlitas
        - fentrol huzas dontve
        - evezes
    - kar:
        - felhuzas egyenes ruddal
        - kalapacs
        - felhuzas francia ruddal
        - koponyaroppanto
        - tarkoraengedes
        - letolas
    - vall:
        - oldalemeles
        - eloreemeles
        - vallbol nyomas
        - negativ tarogatas
        - szembol huzas kotellel
    - lab:
        - combfeszito
        - terdhajlito
        - allovadli
        - guggolas
        - ulovadli
        - deadlift

Pushpull:
    - push:
        - mell
        - vall
        - tricepsz
    - pull:
        - hat
        - bicepsz
    - lab
*/

public class Main {
    public static void main(String[] args) {
        ExerciseLists.adder();
        Terminal.scanner();
    }

}