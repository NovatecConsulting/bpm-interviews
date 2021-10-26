# Praktikum
Dieses Repository ist f�r Interviews mit Interessenten auf einen Praktikumsplatz ausgelegt

# Aufgaben
## Grundlagen Modellierungsverst�ndnis
1. Checke das Repository aus und importiere das Projekt in deine Entwicklungsumgebung. �ffne die Datei 'application.bpmn' mit Camunda Modeler
2. Erkl�re mit Worten das dargestellte Prozessmodell
3. Benenne die im Prozessmodell dargestellten Flusselement-Typen und erkl�re ihre Funktion
4. Erkl�re den Unterschied (bzw. die Gemeinsamkeiten) zwischen den beiden Tasks "Bewerbung pr�fen" sowie den zwischen den Aktivit�ten "Bewerber einladen" und "Bewerber zusagen"

## Verst�ndnis von Camunda WebApps 
1. Starte die Anwendung
2. Navigiere auf den geeigneten Port im localhost, um die WebApps aufzurufen
3. Entnimm die Credentials aus der application.yaml-Datei um dich anzumelden
4. Instanziiere einen Prozess �ber die Tasklist und prozessiere ihn zu einem positiven Ende. Verwende dabei einen Bewerbungstext mit mehr als 10 Zeichen

## Modellierung
1. Erg�nze das Modell dahingehend, dass im Falle einer unvollst�ndigeng Bewerbung anstatt einer direkten Absage eine Nachricht an den Bewerber mit Bitte um Vervollst�ndigung der Unterlagen versandt wird. Daraufhin soll auf den erneuten Eingang von Bewerbungsunterlagen gewartet werden, die dann wie die initialen Unterlagen gepr�ft werden sollen.
2. Erg�nze das Modell so, dass nach 14 Tagen, in denen keine korrigierten Bewerbungsunterlagen eingegangen sind, dem Bewerber abgesagt wird.

## Technisches Prozessmodell & Delegates
1. Erkl�re, warum das Prozessmodell nun nicht mehr deploybar ist, die Anwendung also nicht mehr starten wird. Verifiziere deine Annahme durch den erneuten Startversuch der Anwendung.
2. Erg�nze die Timer-Definition im Prozessmodell
3. Erg�nze eine Implementation f�r den neuen Send-Task und schaffe einen dazugeh�rigen Component
4. Starte die Anwendung um zu verifizieren, dass das Prozessmodell nun korrekt deploybar ist
5. Erzeuge einen Fall mit fehlerhafter Bewerbung und verifiziere den korrekten Verlauf der Prozessinstanz im Cockpit

## Prozessvariablen
1. Ziel soll nun sein, den Namen des Bewerbers in die versendeten Nachrichten zu integrieren. Finde dazu zun�chst den Bezeichner der Prozessvariablen, die mit dem Namen des Bewerbers bef�llt wird, heraus. Dies kannst du im Cockpit oder im Startereignis des Prozesses unter 'Forms' einsehen
2. Erg�nze die Klasse 'ApplicationProcessVariables' um einen Eintrag f�r die Prozessvariable
3. Erg�nze die Klasse 'ApplicationProcessConstants' um getter f�r diese Prozessvariable
4. Nutze diese getter, um in allen Klassen, in denen Nachrichten versandt werden, den Namen des Bewerbers einzubinden.
