//Grace Meredith
//CS330 Exercise 9: Adapter
//8 November 2022

public class Driver {
	public static void main(String[] args) {
		Guitar guitar = new Guitar();
		guitar.PressFretButton(GuitarController.colors.BLUE);
		guitar.PressPick();
		guitar.PressTremelo();

		Dance dancer = new Dance();
		dancer.Step(DanceController.direction.FORWARD);

		GuitarHeroAdapter danceToGuitar = new GuitarHeroAdapter(dancer);
		danceToGuitar.PressFretButton(GuitarController.colors.RED);

		GuitarHeroAdapter guitarToDance =  new GuitarHeroAdapter(guitar);
		guitarToDance.Step(DanceController.direction.MIDDLE);

	}
}