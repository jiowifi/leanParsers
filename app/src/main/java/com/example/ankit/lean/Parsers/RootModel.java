import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_description;
	public VersionModel _version;
	public String organizer_name;
	public String background_image;
	public String location_name;
	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public int id;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String topic;
	public String type;
	public String state;
	public String schedule_published_on;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String privacy;
	public String end_time;
	public String timezone;

	public RootModel(String start_time, String organizer_description, VersionModel version, String organizer_name, String background_image, String location_name, String logo, CopyrightModel copyright, String description, int id, String code_of_conduct, ArrayList<Social_linksModel> social_links, CreatorModel creator, String topic, String type, String state, String schedule_published_on, String name, Call_for_papersModel call_for_papers, String email, String privacy, String end_time, String timezone) {

		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this._version = version;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._creator = creator;
		this.topic = topic;
		this.type = type;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;

	}

}