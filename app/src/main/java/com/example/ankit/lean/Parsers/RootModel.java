import java.util.ArrayList;

class RootModel {

	public String description;
	public String end_time;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public String email;
	public String start_time;
	public String privacy;
	public String type;
	public String logo;
	public String name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String background_image;
	public String timezone;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public String organizer_name;

	public RootModel(String description, String end_time, CreatorModel creator, String code_of_conduct, String state, String email, String start_time, String privacy, String type, String logo, String name, String location_name, ArrayList<Social_linksModel> social_links, int id, String organizer_description, CopyrightModel copyright, String background_image, String timezone, String schedule_published_on, Call_for_papersModel call_for_papers, VersionModel version, String topic, String organizer_name) {

		this.description = description;
		this.end_time = end_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.privacy = privacy;
		this.type = type;
		this.logo = logo;
		this.name = name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.background_image = background_image;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.organizer_name = organizer_name;

	}

}