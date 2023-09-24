1. Wprowadzenie przedmiotów do systemu :
Metoda: POST
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body:
{
"name" : "Metodologie obiektowe",
"ECTS" : 2,
"room" : 216,
"exam" : "true"
},
{
"name" : "Testowanie oprogramowania",
"ECTS" : 1,
"room" : 216,
"exam" : "false"
},
{
"name": "Technologie i aplikacje webowe",
"ECTS": 3,
"room": 208,
"exam": "false"
},
{
"name" : "Zarządzanie projektem informatycznym",
"ECTS" : 2,
"room" : 216,
"exam" : "false"
},
{
"name" : "Zaawansowane technologie bazodanowe",
"ECTS" : 3,
"room" : 208,
"exam" : "false"
},
{
"name" : "Technologie komponentowe i sieciowe",
"ECTS" : 2,
"room" : 208,
"exam" : "true"
}
Odpowiedź:
HTTP Code: 200 OK
Body: brak






2.Pobranie wszystkich przedmiotów :
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
    {
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room": null,
        "exam": true,
        "id": 1
    },
    {
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room": null,
        "exam": true,
        "id": 2
    },
    {
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room": null,
        "exam": true,
        "id": 3
    },
    {
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room": null,
        "exam": true,
        "id": 4
    },
    {
        "name": "Metodologie obiektowe",
        "ECTS": 2,
        "room": null,
        "exam": true,
        "id": 5
    }
]

3Przedmioty posiadające exam
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=tak
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"name": "Metodologie obiektowe",
"ECTS": 2,
"room": 216,
"exam": "tak"
},
{
"id": 6,
"name": "Technologie komponentowe I sieciowe",
"ECTS": 2,
"room": 208,
"exam": "tak"
}
]

4. Pobranie przedmiotów w sali 216:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?room=216
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"name": "Metodologie obiektowe",
"ECTS": 2,
"room": 216,
"exam": "tak"
},
{
"id": 2,
"name": "Testowanie oprogramowania",
"ECTS": 1,
"room": 216,
"exam": "nie"
},
{
"id": 4,
"name": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"room": 216,
"exam": "nie"
}
]

5. Pobranie przedmiotów bez examu w sali 208:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities?exam=nie&room=208
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 3,
"name": "Technologie i aplikacje webowe",
"ECTS": 3,
"room": 208,
"exam": "nie"
},
{
"id": 5,
"name": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"room": 208,
"exam": "nie"
}
]

6. Pobranie przedmiotu o id 3
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/3
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 3,
"name": "Technologie i aplikacje webowe",
"ECTS": 3,
"room": 208,
"exam": "nie"
}
]
7. Pobranie przedmiotu o id 15:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities/15
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak


8. Usunięcie przedmiotu o id 2:
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities/2
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak

9. Pobranie wszystkich przedmiotów
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body:
[
{
"id": 1,
"name": "Metodologie obiektowe",
"ECTS": 2,
"room": 216,
"exam": "tak"
},
{
"id": 3,
"name": "Technologie i aplikacje webowe",
"ECTS": 3,
"room": 208,
"exam": "nie"
},
{
"id": 4,
"name": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"room": 216,
"exam": "nie"
},
{
"id": 5,
"name": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"room": 208,
"exam": "nie"
},
{
"id": 6,
"name": "Technologie komponentowe I sieciowe",
"ECTS": 2,
"room": 208,
"exam": "tak"
}
]

10. Usunięcie wszystkich przedmiotów:
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak

11. Pobranie wszystkich przedmiotów:
Metoda: GET
Adres zasobu: http://localhost:8080/api/activities
Nagłówki: Content-Type: application/json
Request Body: brak
Odpowiedź:
HTTP Code: 200 OK
Body: brak