import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String timezone;
	public String name;
	public String background_image;
	public String description;
	public String privacy;
	public String organizer_name;
	public String location_name;
	public String code_of_conduct;
	public String state;
	public String start_time;
	public String end_time;
	public String type;
	public VersionModel _version;

	public RootModel(String schedule_published_on, ArrayList<Social_linksModel> social_links, String topic, int id, String organizer_description, CreatorModel creator, CopyrightModel copyright, String email, Call_for_papersModel call_for_papers, String logo, String timezone, String name, String background_image, String description, String privacy, String organizer_name, String location_name, String code_of_conduct, String state, String start_time, String end_time, String type, VersionModel version) {

		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.topic = topic;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.timezone = timezone;
		this.name = name;
		this.background_image = background_image;
		this.description = description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this._version = version;

	}

}