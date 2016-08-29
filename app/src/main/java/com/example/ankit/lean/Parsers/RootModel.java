import java.util.ArrayList;

class RootModel {

	public String logo;
	public String description;
	public int id;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String type;
	public String end_time;
	public String name;
	public String background_image;
	public String organizer_description;
	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String location_name;
	public String topic;
	public String code_of_conduct;
	public String timezone;

	public RootModel(String logo, String description, int id, String privacy, VersionModel version, String organizer_name, ArrayList<Social_linksModel> social_links, String state, String type, String end_time, String name, String background_image, String organizer_description, String schedule_published_on, String email, Call_for_papersModel call_for_papers, String start_time, CopyrightModel copyright, CreatorModel creator, String location_name, String topic, String code_of_conduct, String timezone) {

		this.logo = logo;
		this.description = description;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.location_name = location_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;

	}

}