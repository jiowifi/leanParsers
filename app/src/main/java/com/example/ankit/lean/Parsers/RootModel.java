import java.util.ArrayList;

class RootModel {

	public String name;
	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String start_time;
	public String state;
	public String end_time;
	public VersionModel _version;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public String schedule_published_on;
	public int id;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;

	public RootModel(String name, String organizer_description, String organizer_name, String code_of_conduct, String logo, CopyrightModel copyright, String type, String background_image, String start_time, String state, String end_time, VersionModel version, String location_name, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String privacy, String description, String schedule_published_on, int id, String email, ArrayList<Social_linksModel> social_links, String timezone) {

		this.name = name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.start_time = start_time;
		this.state = state;
		this.end_time = end_time;
		this._version = version;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.email = email;
		this.social_links = social_links;
		this.timezone = timezone;

	}

}