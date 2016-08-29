import java.util.ArrayList;

class RootModel {

	public String topic;
	public String background_image;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String type;
	public String location_name;
	public String email;
	public CreatorModel _creator;
	public String organizer_name;
	public String organizer_description;
	public int id;
	public String end_time;
	public String schedule_published_on;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String start_time;
	public String logo;
	public String description;
	public String state;
	public VersionModel _version;

	public RootModel(String topic, String background_image, String timezone, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String code_of_conduct, String type, String location_name, String email, CreatorModel creator, String organizer_name, String organizer_description, int id, String end_time, String schedule_published_on, String privacy, Call_for_papersModel call_for_papers, String name, String start_time, String logo, String description, String state, VersionModel version) {

		this.topic = topic;
		this.background_image = background_image;
		this.timezone = timezone;
		this.social_links = social_links;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.location_name = location_name;
		this.email = email;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this.state = state;
		this._version = version;

	}

}