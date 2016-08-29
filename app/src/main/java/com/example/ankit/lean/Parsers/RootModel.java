import java.util.ArrayList;

class RootModel {

	public String type;
	public String background_image;
	public String timezone;
	public String state;
	public String organizer_name;
	public String logo;
	public String email;
	public String end_time;
	public String topic;
	public String schedule_published_on;
	public String description;
	public CreatorModel _creator;
	public VersionModel _version;
	public String code_of_conduct;
	public String name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String start_time;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String type, String background_image, String timezone, String state, String organizer_name, String logo, String email, String end_time, String topic, String schedule_published_on, String description, CreatorModel creator, VersionModel version, String code_of_conduct, String name, String location_name, ArrayList<Social_linksModel> social_links, String privacy, String start_time, CopyrightModel copyright, int id, String organizer_description, Call_for_papersModel call_for_papers) {

		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.state = state;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.email = email;
		this.end_time = end_time;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._creator = creator;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.start_time = start_time;
		this._copyright = copyright;
		this.id = id;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;

	}

}