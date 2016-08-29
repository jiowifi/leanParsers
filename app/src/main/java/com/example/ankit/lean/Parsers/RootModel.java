import java.util.ArrayList;

class RootModel {

	public String state;
	public String end_time;
	public String name;
	public VersionModel _version;
	public String code_of_conduct;
	public String location_name;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String topic;
	public String start_time;
	public String background_image;
	public String organizer_name;
	public String logo;
	public String type;
	public String organizer_description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public int id;
	public String timezone;

	public RootModel(String state, String end_time, String name, VersionModel version, String code_of_conduct, String location_name, String email, String description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String privacy, String topic, String start_time, String background_image, String organizer_name, String logo, String type, String organizer_description, String schedule_published_on, CreatorModel creator, int id, String timezone) {

		this.state = state;
		this.end_time = end_time;
		this.name = name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.topic = topic;
		this.start_time = start_time;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;

	}

}