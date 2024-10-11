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

### Konkrete Rabattstrategien
1. **MidiDiscount**: 15% Rabatt
2. **MaxiDiscount**: 30% Rabatt
3. **ZeroDiscount**: Kein Rabatt

## Funktionsweise
1. Ein `Angebot` wird mit Preis, Datum und Flugnummer erstellt
2. Basierend auf dem Monat wird eine Rabattstrategie gewählt
3. Der reduzierte Preis wird berechnet

## Beispielausgabe
Regulärer Preis: 200.0
Reduzierter Preis: 140.0
Angewandte Rabattstrategie: MaxiDiscount

## Hinweis
Monate in `GregorianCalendar` sind nullbasiert (Januar = 0, Dezember = 11)