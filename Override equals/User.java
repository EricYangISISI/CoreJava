class User{

	String name;
	int age;
	public User(){

	}

	public User(String name, int age){
		this.name = name;
		this.age = age;
	}


	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}

		boolean type = obj instanceof User;

		if(type){

			User u = (User) obj;

			if(this.age==u.age && this.name.equals(u.name)){

				return true;
			}
		else{
			return false;
		}
		}
		else{
			return false;
		}
	}

	public int hashCode(){
		int result = 17;
		result = 31 * result + this.age;
		result = 31 * result + name.hashCode();

		return result;
	}
}