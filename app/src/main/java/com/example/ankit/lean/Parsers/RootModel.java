import java.util.ArrayList;

class RootModel {

	public String state;
	public String name;
	public int id;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;
	public String end_time;
	public String type;
	public String logo;
	public String privacy;
	public String background_image;
	public String start_time;
	public String organizer_description;
	public String description;
	public String email;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String state, String name, int id, CreatorModel creator, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String location_name, String topic, String end_time, String type, String logo, String privacy, String background_image, String start_time, String organizer_description, String description, String email, String schedule_published_on, String organizer_name, String timezone, VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.state = state;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this._copyright = copyright;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;
		this.end_time = end_time;
		this.type = type;
		this.logo = logo;
		this.privacy = privacy;
		this.background_image = background_image;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.description = description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}