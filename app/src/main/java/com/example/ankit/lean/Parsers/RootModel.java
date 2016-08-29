import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String description;
	public String topic;
	public String timezone;
	public VersionModel _version;
	public String background_image;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public String name;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String location_name;
	public String schedule_published_on;
	public String email;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;
	public int id;
	public String start_time;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String privacy, String logo, String description, String topic, String timezone, VersionModel version, String background_image, String type, String organizer_description, String code_of_conduct, String name, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_name, String location_name, String schedule_published_on, String email, CopyrightModel copyright, String end_time, String state, int id, String start_time, Call_for_papersModel call_for_papers) {

		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.topic = topic;
		this.timezone = timezone;
		this._version = version;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;

	}

}