import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String organizer_name;
	public String schedule_published_on;
	public String logo;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String description;
	public CreatorModel _creator;
	public String email;
	public String organizer_description;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public String state;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public int id;
	public String start_time;
	public String topic;
	public String location_name;

	public RootModel(VersionModel version, String organizer_name, String schedule_published_on, String logo, CopyrightModel copyright, String code_of_conduct, String description, CreatorModel creator, String email, String organizer_description, String background_image, String end_time, Call_for_papersModel call_for_papers, String privacy, String name, String state, String type, ArrayList<Social_linksModel> social_links, String timezone, int id, String start_time, String topic, String location_name) {

		this._version = version;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._creator = creator;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this.state = state;
		this.type = type;
		this.social_links = social_links;
		this.timezone = timezone;
		this.id = id;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;

	}

}