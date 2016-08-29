import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String logo;
	public String privacy;
	public String name;
	public String start_time;
	public CreatorModel _creator;
	public int id;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public String state;
	public VersionModel _version;
	public String code_of_conduct;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String topic;
	public String timezone;
	public String organizer_description;

	public RootModel(String background_image, String logo, String privacy, String name, String start_time, CreatorModel creator, int id, String email, String description, Call_for_papersModel call_for_papers, String type, String schedule_published_on, CopyrightModel copyright, String end_time, String state, VersionModel version, String code_of_conduct, String location_name, ArrayList<Social_linksModel> social_links, String organizer_name, String topic, String timezone, String organizer_description) {

		this.background_image = background_image;
		this.logo = logo;
		this.privacy = privacy;
		this.name = name;
		this.start_time = start_time;
		this._creator = creator;
		this.id = id;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this.state = state;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.timezone = timezone;
		this.organizer_description = organizer_description;

	}

}