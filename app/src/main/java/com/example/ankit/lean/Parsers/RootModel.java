import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String background_image;
	public String organizer_description;
	public String name;
	public String email;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String location_name;
	public String organizer_name;
	public int id;
	public String code_of_conduct;
	public String description;
	public String type;
	public String privacy;
	public String schedule_published_on;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String topic;
	public CreatorModel _creator;
	public String end_time;

	public RootModel(String timezone, String background_image, String organizer_description, String name, String email, VersionModel version, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String state, String location_name, String organizer_name, int id, String code_of_conduct, String description, String type, String privacy, String schedule_published_on, String start_time, Call_for_papersModel call_for_papers, String logo, String topic, CreatorModel creator, String end_time) {

		this.timezone = timezone;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.name = name;
		this.email = email;
		this._version = version;
		this._copyright = copyright;
		this.social_links = social_links;
		this.state = state;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.type = type;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.topic = topic;
		this._creator = creator;
		this.end_time = end_time;

	}

}