import java.util.ArrayList;

class RootModel {

	public String state;
	public String organizer_name;
	public int id;
	public String type;
	public String privacy;
	public String name;
	public String organizer_description;
	public CreatorModel _creator;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String background_image;
	public String location_name;
	public String topic;
	public String schedule_published_on;
	public String email;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String state, String organizer_name, int id, String type, String privacy, String name, String organizer_description, CreatorModel creator, VersionModel version, CopyrightModel copyright, String background_image, String location_name, String topic, String schedule_published_on, String email, String code_of_conduct, String end_time, String start_time, String logo, ArrayList<Social_linksModel> social_links, String timezone, String description, Call_for_papersModel call_for_papers) {

		this.state = state;
		this.organizer_name = organizer_name;
		this.id = id;
		this.type = type;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._version = version;
		this._copyright = copyright;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this._call_for_papers = call_for_papers;

	}

}