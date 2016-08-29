import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String code_of_conduct;
	public String email;
	public CreatorModel _creator;
	public int id;
	public String background_image;
	public String end_time;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public VersionModel _version;
	public String location_name;
	public String topic;
	public String schedule_published_on;
	public String state;
	public String organizer_description;
	public String name;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(ArrayList<Social_linksModel> social_links, String logo, String description, Call_for_papersModel call_for_papers, String timezone, String code_of_conduct, String email, CreatorModel creator, int id, String background_image, String end_time, String start_time, String organizer_name, String privacy, VersionModel version, String location_name, String topic, String schedule_published_on, String state, String organizer_description, String name, String type, CopyrightModel copyright) {

		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._creator = creator;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._version = version;
		this.location_name = location_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;
		this._copyright = copyright;

	}

}