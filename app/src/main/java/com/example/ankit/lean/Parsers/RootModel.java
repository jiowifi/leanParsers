import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String type;
	public String description;
	public String state;
	public String schedule_published_on;
	public String location_name;
	public CreatorModel _creator;
	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public int id;
	public String timezone;
	public String start_time;
	public String email;
	public CopyrightModel _copyright;
	public String background_image;
	public String organizer_description;
	public String organizer_name;
	public String name;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, String privacy, String type, String description, String state, String schedule_published_on, String location_name, CreatorModel creator, String logo, String topic, Call_for_papersModel call_for_papers, String end_time, int id, String timezone, String start_time, String email, CopyrightModel copyright, String background_image, String organizer_description, String organizer_name, String name, String code_of_conduct, VersionModel version) {

		this.social_links = social_links;
		this.privacy = privacy;
		this.type = type;
		this.description = description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._creator = creator;
		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.start_time = start_time;
		this.email = email;
		this._copyright = copyright;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}