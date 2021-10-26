# Praktikum
Dieses Repository ist für Interviews mit Interessenten auf einen Praktikumsplatz ausgelegt

# Aufgaben
## Grundlagen Modellierungsverständnis
1. Checke das Repository aus und importiere das Projekt in deine Entwicklungsumgebung. Öffne die Datei 'application.bpmn' mit Camunda Modeler
2. Erkläre mit Worten das dargestellte Prozessmodell
3. Benenne die im Prozessmodell dargestellten Flusselement-Typen und erkläre ihre Funktion
4. Erkläre den Unterschied (bzw. die Gemeinsamkeiten) zwischen den beiden Tasks "Bewerbung prüfen" sowie den zwischen den Aktivitäten "Bewerber einladen" und "Bewerber zusagen"

## Verständnis von Camunda WebApps 
1. Starte die Anwendung
2. Navigiere auf den geeigneten Port im localhost, um die WebApps aufzurufen
3. Entnimm die Credentials aus der application.yaml-Datei um dich anzumelden
4. Instanziiere einen Prozess über die Tasklist und prozessiere ihn zu einem positiven Ende. Verwende dabei einen Bewerbungstext mit mehr als 10 Zeichen

## Modellierung
1. Ergänze das Modell dahingehend, dass im Falle einer unvollständigeng Bewerbung anstatt einer direkten Absage eine Nachricht an den Bewerber mit Bitte um Vervollständigung der Unterlagen versandt wird. Daraufhin soll auf den erneuten Eingang von Bewerbungsunterlagen gewartet werden, die dann wie die initialen Unterlagen geprüft werden sollen.
2. Ergänze das Modell so, dass nach 14 Tagen, in denen keine korrigierten Bewerbungsunterlagen eingegangen sind, dem Bewerber abgesagt wird.

## Technisches Prozessmodell & Delegates
1. Erkläre, warum das Prozessmodell nun nicht mehr deploybar ist, die Anwendung also nicht mehr starten wird. Verifiziere deine Annahme durch den erneuten Startversuch der Anwendung.
2. Ergänze die Timer-Definition im Prozessmodell
3. Ergänze eine Implementation für den neuen Send-Task und schaffe einen dazugehörigen Component
4. Starte die Anwendung um zu verifizieren, dass das Prozessmodell nun korrekt deploybar ist
5. Erzeuge einen Fall mit fehlerhafter Bewerbung und verifiziere den korrekten Verlauf der Prozessinstanz im Cockpit

## Prozessvariablen
1. Ziel soll nun sein, den Namen des Bewerbers in die versendeten Nachrichten zu integrieren. Finde dazu zunächst den Bezeichner der Prozessvariablen, die mit dem Namen des Bewerbers befüllt wird, heraus. Dies kannst du im Cockpit oder im Startereignis des Prozesses unter 'Forms' einsehen
2. Ergänze die Klasse 'ApplicationProcessVariables' um einen Eintrag für die Prozessvariable
3. Ergänze die Klasse 'ApplicationProcessConstants' um getter für diese Prozessvariable
4. Nutze diese getter, um in allen Klassen, in denen Nachrichten versandt werden, den Namen des Bewerbers einzubinden.
