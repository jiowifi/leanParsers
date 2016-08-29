import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String end_time;
	public int id;
	public String timezone;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String code_of_conduct;
	public String logo;
	public VersionModel _version;
	public String description;
	public String state;
	public String background_image;
	public String location_name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public String topic;
	public String name;

	public RootModel(String start_time, String end_time, int id, String timezone, String email, Call_for_papersModel call_for_papers, String privacy, String code_of_conduct, String logo, VersionModel version, String description, String state, String background_image, String location_name, String schedule_published_on, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_name, CopyrightModel copyright, String type, String organizer_description, String topic, String name) {

		this.start_time = start_time;
		this.end_time = end_time;
		this.id = id;
		this.timezone = timezone;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._version = version;
		this.description = description;
		this.state = state;
		this.background_image = background_image;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.name = name;

	}

}