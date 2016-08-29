import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String logo;
	public String topic;
	public String organizer_description;
	public String state;
	public String end_time;
	public String email;
	public String type;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public CreatorModel _creator;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public String privacy;
	public String start_time;

	public RootModel(VersionModel version, String logo, String topic, String organizer_description, String state, String end_time, String email, String type, String background_image, String timezone, String organizer_name, CreatorModel creator, int id, ArrayList<Social_linksModel> social_links, String name, String description, Call_for_papersModel call_for_papers, String code_of_conduct, CopyrightModel copyright, String location_name, String schedule_published_on, String privacy, String start_time) {

		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.state = state;
		this.end_time = end_time;
		this.email = email;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.id = id;
		this.social_links = social_links;
		this.name = name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.start_time = start_time;

	}

}