# Flugangebot-Programm Dokumentation

## Übersicht
Dieses Programm verwaltet Flugangebote und berechnet reduzierte Preise basierend auf monatsspezifischen Rabattstrategien.

## Klassenstruktur

### Main
- Hauptklasse zum Ausführen des Programms
- Erstellt ein `Angebot`-Objekt und gibt Details aus

### Angebot
- Attribute: regulaerpreis, flugdatum, flugnummer, rabattstrategie, reduzierterPreis
- Konstruktor initialisiert Attribute und wählt Rabattstrategie
- Methode `rabattstrategieWaehlen()` bestimmt die passende Strategie basierend auf dem Monat

### Rabattstrategie (abstrakt)
- Attribut: bezeichnung
- Abstrakte Methode: `getReduzierterPreis(double d)`
