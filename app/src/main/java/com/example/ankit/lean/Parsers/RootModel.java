import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public VersionModel _version;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String state;
	public String location_name;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String start_time;
	public String description;
	public CopyrightModel _copyright;
	public String logo;
	public String email;
	public String organizer_name;

	public RootModel(String schedule_published_on, String timezone, String code_of_conduct, String type, VersionModel version, int id, ArrayList<Social_linksModel> social_links, String end_time, Call_for_papersModel call_for_papers, String name, String background_image, String state, String location_name, String privacy, CreatorModel creator, String organizer_description, String topic, String start_time, String description, CopyrightModel copyright, String logo, String email, String organizer_name) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._version = version;
		this.id = id;
		this.social_links = social_links;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.state = state;
		this.location_name = location_name;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;
		this.description = description;
		this._copyright = copyright;
		this.logo = logo;
		this.email = email;
		this.organizer_name = organizer_name;

	}

}