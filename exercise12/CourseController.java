public class CourseController {
   private Course model;
   private CourseView view;

   public CourseController(Course model, CourseView view){
      this.model = model;
      this.view = view;
   }

   public void setCourseName(String name){
      model.setName(name);		
   }

   public String getCourseName(){
      return model.getName();		
   }

   public void setCourseDescription(String d){
      model.setDescription(d);		
   }

   public String getCourseDescription(){
      return model.getDescription();		
   }

   public void setCourseNumber(int num) {
      model.setNumber(num);
   }

   public int getCourseNumber() {
      return model.getNumber();
   }

   public void updateView(){				
      view.printCourseDetails(model.getName(), model.getDescription(), model.getNumber());
   }	
}