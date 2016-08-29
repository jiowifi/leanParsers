import java.util.ArrayList;

class RootModel {

	public String description;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_name;
	public String logo;
	public String state;
	public String organizer_description;
	public String background_image;
	public String name;
	public String code_of_conduct;
	public String email;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String end_time;
	public String start_time;
	public String topic;
	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public String location_name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_name, String logo, String state, String organizer_description, String background_image, String name, String code_of_conduct, String email, int id, String privacy, String schedule_published_on, CreatorModel creator, String end_time, String start_time, String topic, CopyrightModel copyright, String timezone, String type, String location_name, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.social_links = social_links;
		this._version = version;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.state = state;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.end_time = end_time;
		this.start_time = start_time;
		this.topic = topic;
		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;

	}

}