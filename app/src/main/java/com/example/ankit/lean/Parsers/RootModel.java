import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String location_name;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public VersionModel _version;
	public String type;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String end_time;
	public int id;
	public String state;
	public String logo;
	public String schedule_published_on;
	public String start_time;
	public CreatorModel _creator;
	public String description;
	public String email;
	public String timezone;

	public RootModel(String organizer_description, String location_name, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, VersionModel version, String type, String background_image, ArrayList<Social_linksModel> social_links, String topic, String name, String organizer_name, CopyrightModel copyright, String end_time, int id, String state, String logo, String schedule_published_on, String start_time, CreatorModel creator, String description, String email, String timezone) {

		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._version = version;
		this.type = type;
		this.background_image = background_image;
		this.social_links = social_links;
		this.topic = topic;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.end_time = end_time;
		this.id = id;
		this.state = state;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._creator = creator;
		this.description = description;
		this.email = email;
		this.timezone = timezone;

	}

}