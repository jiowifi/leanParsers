import java.util.ArrayList;

class RootModel {

	public int id;
	public String end_time;
	public String privacy;
	public String type;
	public CreatorModel _creator;
	public VersionModel _version;
	public String email;
	public String organizer_description;
	public String code_of_conduct;
	public String start_time;
	public String name;
	public String timezone;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public String schedule_published_on;
	public String logo;
	public String description;
	public String background_image;
	public CopyrightModel _copyright;
	public String location_name;

	public RootModel(int id, String end_time, String privacy, String type, CreatorModel creator, VersionModel version, String email, String organizer_description, String code_of_conduct, String start_time, String name, String timezone, String organizer_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String topic, String state, String schedule_published_on, String logo, String description, String background_image, CopyrightModel copyright, String location_name) {

		this.id = id;
		this.end_time = end_time;
		this.privacy = privacy;
		this.type = type;
		this._creator = creator;
		this._version = version;
		this.email = email;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.name = name;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.location_name = location_name;

	}

}