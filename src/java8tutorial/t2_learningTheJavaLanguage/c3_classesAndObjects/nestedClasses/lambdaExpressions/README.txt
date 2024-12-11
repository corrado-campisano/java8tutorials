


=========================================================================================

1) Forma piu' compatta delle anonymous inner classes

	(Approach 4 e 5)
=========================================================================================


Le lambda expression sono un modo di rendere piu' compatto qualcosa del genere:
		
		
		printPersons(
			roster, 
			new CheckPerson() {
					public boolean test(Person p) {
						return p.getGender() == Person.Sex.MALE 
							&& p.getAge() >= 18 
							&& p.getAge() <= 25;
					}
			}
		);


L'obiettivo e' sostituire la sintassi della anonymous inner class CheckPerson:
				
		
		printPersons(
			roster, 
			(Person p) -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25
		);


Come si vede, il secondo parametro, rappresentato da una anonymous inner class:
		
			new CheckPerson() {
					public boolean test(Person p) {
						return p.getGender() == Person.Sex.MALE 
							&& p.getAge() >= 18 
							&& p.getAge() <= 25;
					}
			}

e' stato sostituito dalla lambda expression:

			(Person p) -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25






=========================================================================================

2) Utilizzo delle functional interfaces (java.util.function)

	(Approach 6)
=========================================================================================


Nel caso precedente, il metodo chiamato, printPersons, era il seguente:


	public static void printPersons(
		List<Person> roster, 
		CheckPerson tester) {
		
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}


per cui la chiamata con le lambda expression era la seguente:

		printPersons(
			roster, 
			(Person p) -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25
		);

con la lambda expression:

			(Person p) -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25
				
che andava a sostituire l'inner class anonima:

			new CheckPerson() {
					public boolean test(Person p) {
						return p.getGender() == Person.Sex.MALE 
							&& p.getAge() >= 18 
							&& p.getAge() <= 25;
					}
			}



Ma se passiamo ad un metodo che richiede una interfaccia funzionale Predicate<Person>:

	public static void printPersonsWithPredicate(
		List<Person> roster, 
		Predicate<Person> tester) {
		
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

la chiamata con la lambda diventera' piu' semplice:

		printPersonsWithPredicate(
			roster,
			p -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25
		);

la differenza e' che non c'e' la dichiarazione completa (Person p) ma solo p:

		printPersons(
			roster, 
			(Person p) -> p.getGender() == Person.Sex.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 25
		);

PS: dice che le parentesi e i tipi possono essere opzionali:
You can omit the data type of the parameters in a lambda expression. 
In addition, you can omit the parentheses if there is only one parameter.





=========================================================================================

3) Usare le lambda anche per specificare le azioni (non solo le condizioni)

	(Approach 7)
=========================================================================================


Nei casi precedenti, ci limitavamo a passare delle condizioni, tramite inner class anonima o 
tramite lambda expression; in questo caso vogliamo passare anche le azioni, tramite lambda
expressions; per questo usiamo l'interfaccia funzionale Consumer<T> che definisce il metodo
void accept(T t), nel metodo chiamato:

	public static void processPersons(
	    List<Person> roster,
	    Predicate<Person> tester,
	    Consumer<Person> block) {
	    
	        for (Person p : roster) {
	            if (tester.test(p)) {
	                block.accept(p);
	            }
	        }
	}


La chiamata al metodo avra' quindi due lambda expressions:

	processPersons(
	     roster,
	     p -> p.getGender() == Person.Sex.MALE
	         && p.getAge() >= 18
	         && p.getAge() <= 25,
	     p -> p.printPerson()
	);

la prima specifica i criteri, la seconda l'azione da compiere.


E fin qui tutto chiaro...


Il gioco di aggiungere funzionalita' tramite lambda functions puo' continuare:
possiamo ad esempio coinvolgere l'interfaccia funzionale Function<T,R> che 
definisce il metodo R apply(T t), in modo che il metodo seguente sia definito:

	public static void processPersonsWithFunction(
	    List<Person> roster,
	    Predicate<Person> tester,
	    Function<Person, String> mapper,
	    Consumer<String> block) {
	    
	    for (Person p : roster) {
	        if (tester.test(p)) {
	            String data = mapper.apply(p);
	            block.accept(data);
	        }
	    }
	}

per cui se una persona e' selezionata dal test, viene recuperato un suo dato,
tramite Function<Person, String> mapper, mediante String data = mapper.apply(p),
di modo che ad essere processato sia questo dato recuperato.


Tale metodo viene chiamato in questo modo:

	processPersonsWithFunction(
	    roster,
	    p -> p.getGender() == Person.Sex.MALE
	        && p.getAge() >= 18
	        && p.getAge() <= 25,
	    p -> p.getEmailAddress(),
	    email -> System.out.println(email)
	);

ma non capisco la sintassi della terza lambda expression, cioe'
email -> System.out.println(email), quella che prima era solo
p -> p.printPerson(): da dove esce "email"??? 
e' solo il nome dato ad un parametro stringa!?!

	processPersons(
	     roster,
	     p -> p.getGender() == Person.Sex.MALE
	         && p.getAge() >= 18
	         && p.getAge() <= 25,
	     p -> p.printPerson()
	);


