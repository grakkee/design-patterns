//Grace Meredith & Dillon Dogde
//CS330 Exercise 12: MVC
//06 December 2022

public class Driver {
	public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Course model  = retriveCourseFromDatabase();

      //Create a view : to write student details on console
      CourseView view = new CourseView();

      CourseController controller = new CourseController(model, view);

      controller.updateView();

      //update model data
      controller.setCourseName("Biology");

      controller.updateView();
   }

   private static Course retriveCourseFromDatabase(){
      Course c = new Course();
      c.setName("Computer Science");
      c.setNumber(10);
      c.setDescription("Inrto to CS in C");
      return c;
   }
}