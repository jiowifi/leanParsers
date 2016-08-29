import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public String type;
	public String organizer_name;
	public String logo;
	public int id;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_description;
	public String description;
	public String privacy;
	public String schedule_published_on;
	public String background_image;
	public String topic;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CopyrightModel _copyright;
	public String location_name;
	public String start_time;
	public VersionModel _version;
	public String state;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String end_time, String code_of_conduct, String type, String organizer_name, String logo, int id, CreatorModel creator, String timezone, String organizer_description, String description, String privacy, String schedule_published_on, String background_image, String topic, String email, ArrayList<Social_linksModel> social_links, String name, CopyrightModel copyright, String location_name, String start_time, VersionModel version, String state, Call_for_papersModel call_for_papers) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.topic = topic;
		this.email = email;
		this.social_links = social_links;
		this.name = name;
		this._copyright = copyright;
		this.location_name = location_name;
		this.start_time = start_time;
		this._version = version;
		this.state = state;
		this._call_for_papers = call_for_papers;

	}

}