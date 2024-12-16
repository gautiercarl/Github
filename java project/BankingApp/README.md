# Java Banking App

Dies ist eine einfache Banking-Anwendung, die verschiedene Kontotypen wie **Girokonto** und **Sparkonto** implementiert. Benutzer können sich anmelden, Bankkonten erstellen, Einzahlungen und Abhebungen vornehmen sowie Überweisungen tätigen.

## Funktionen

- **Benutzeranmeldung**: Benutzer können sich mit ihrem Namen und Passwort anmelden.
- **Kontoerstellung**: Benutzer können ein neues Bankkonto erstellen.
- **Kontoverwaltung**:
  - **Kontostand anzeigen**
  - **Geld einzahlen**
  - **Geld abheben**
  - **Geld überweisen**
- **Unterstützte Konten**:
  - **Girokonto**: Mit einem Überziehungsrahmen für Abhebungen.
  - **Sparkonto**: Bietet Zinsen auf das Guthaben.
  
## Anforderungen

- Java 8 oder höher
- Eine Entwicklungsumgebung wie IntelliJ IDEA, Eclipse oder NetBeans

## Installation

1. Klone dieses Repository:
   ```bash
   git clone https://github.com/gautiercarl/Github.git

2. Navigiere in das Projektverzeichnis:
```bash
cd "Github/java project/BankingApp"

3. Kompiliere und starte das Projekt:
In der IDE: Öffne das Projekt und starte die Main-Klasse.
Manuell:
```bash
javac *.java
```bash
java Main.java

## Verwendung
Nach dem Start der Anwendung wird der Benutzer mit einem Menü begrüßt. Er kann wählen, ob er sich anmelden oder ein neues Konto erstellen möchte.

### Anmeldeprozess
Geben Sie Ihren Benutzernamen und Ihr Passwort ein.
Wenn die Anmeldedaten korrekt sind, wird der Benutzer auf das Hauptmenü weitergeleitet.
Kontoverwaltung
Sobald der Benutzer angemeldet ist, kann er auf seine Konten zugreifen und verschiedene Aktionen ausführen:
Kontostand anzeigen
- Geld einzahlen
- Geld abheben
- Geld überweisen

### Beispiel:
Willkommen bei der Java Bank
------------------------------------------
1-Anmelden
2-Konto erstellen
3-Programm beenden

### Benutzer erstellen
Benutzer können ein neues Konto erstellen, indem sie ihren Namen und ein Passwort eingeben.
Wenn der Name bereits vergeben ist, wird eine entsprechende Nachricht angezeigt.
Bankkonten
Benutzer können zwischen verschiedenen Kontotypen wählen:
- Girokonto: Mit einem Überziehungsrahmen, der es ermöglicht, mehr Geld abzuheben als auf dem Konto vorhanden ist.
- Sparkonto: Bietet Zinsen auf das Guthaben und ermöglicht keine Überziehung.

## Struktur des Codes
- Bankkonto: Abstrakte Klasse, die grundlegende Funktionen für Bankkonten bereitstellt.
- Benutzer: Repräsentiert einen Benutzer der Bank mit Methoden zur Anmeldung und Verwaltung von Bankkonten.
- Girokonto: Eine Implementierung des Bankkontos, das einen Überziehungsrahmen bietet.
- Sparkonto: Eine Implementierung des Bankkontos, das Zinsen auf das Guthaben bietet.
- Kontoinfo: Ein Interface, das von verschiedenen Kontotypen implementiert wird, um den Kontonamen bereitzustellen.
- Bank: Verwaltet die Benutzer und bietet Funktionen wie Kontenerstellung und Überweisungen.
Lizenz
Dieses Projekt ist unter der MIT-Lizenz lizenziert - siehe LICENSE für Details.

## Mitwirkende
Gautier Carl
Weitere Features
Überweisungen zwischen Konten
Fehlerbehandlung bei ungültigen Eingaben
Möglichkeit, mehrere Konten pro Benutzer zu haben
markdown

