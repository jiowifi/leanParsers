import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String logo;
	public String background_image;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public String email;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String type;
	public String timezone;

	public RootModel(String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, int id, String logo, String background_image, VersionModel version, String topic, String code_of_conduct, String description, String location_name, CopyrightModel copyright, String name, String email, String organizer_description, String start_time, String organizer_name, String state, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String type, String timezone) {

		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.logo = logo;
		this.background_image = background_image;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this.email = email;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.type = type;
		this.timezone = timezone;

	}

}