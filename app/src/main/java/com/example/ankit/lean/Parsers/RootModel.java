import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public String schedule_published_on;
	public String organizer_name;
	public String end_time;
	public String type;
	public VersionModel _version;
	public String background_image;
	public String location_name;
	public String state;
	public String organizer_description;
	public String topic;
	public String privacy;
	public String timezone;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String logo;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String code_of_conduct, CreatorModel creator, String email, String start_time, String schedule_published_on, String organizer_name, String end_time, String type, VersionModel version, String background_image, String location_name, String state, String organizer_description, String topic, String privacy, String timezone, String description, CopyrightModel copyright, String name, String logo, int id, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers) {

		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.location_name = location_name;
		this.state = state;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.privacy = privacy;
		this.timezone = timezone;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.logo = logo;
		this.id = id;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;

	}

}