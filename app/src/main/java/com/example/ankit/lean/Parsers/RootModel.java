import java.util.ArrayList;

class RootModel {

	public String state;
	public String end_time;
	public CreatorModel _creator;
	public String background_image;
	public String code_of_conduct;
	public String name;
	public String privacy;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public String organizer_description;
	public String schedule_published_on;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public String timezone;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String location_name;
	public String logo;
	public String organizer_name;

	public RootModel(String state, String end_time, CreatorModel creator, String background_image, String code_of_conduct, String name, String privacy, CopyrightModel copyright, String topic, String description, String organizer_description, String schedule_published_on, VersionModel version, Call_for_papersModel call_for_papers, String email, String start_time, String timezone, String type, ArrayList<Social_linksModel> social_links, int id, String location_name, String logo, String organizer_name) {

		this.state = state;
		this.end_time = end_time;
		this._creator = creator;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this.timezone = timezone;
		this.type = type;
		this.social_links = social_links;
		this.id = id;
		this.location_name = location_name;
		this.logo = logo;
		this.organizer_name = organizer_name;

	}

}