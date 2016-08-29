import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String location_name;
	public String topic;
	public String organizer_name;
	public VersionModel _version;
	public String end_time;
	public String schedule_published_on;
	public String description;
	public String state;
	public String logo;
	public int id;
	public String email;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String name;
	public String timezone;

	public RootModel(ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String organizer_description, String start_time, CreatorModel creator, String location_name, String topic, String organizer_name, VersionModel version, String end_time, String schedule_published_on, String description, String state, String logo, int id, String email, String type, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String background_image, String name, String timezone) {

		this.social_links = social_links;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.location_name = location_name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._version = version;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.id = id;
		this.email = email;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.name = name;
		this.timezone = timezone;

	}

}