import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String description;
	public String start_time;
	public String type;
	public String organizer_description;
	public String state;
	public String email;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String end_time;
	public String organizer_name;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String code_of_conduct;
	public String schedule_published_on;
	public String background_image;
	public CreatorModel _creator;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(VersionModel version, String description, String start_time, String type, String organizer_description, String state, String email, String timezone, String privacy, CopyrightModel copyright, String end_time, String organizer_name, String location_name, int id, ArrayList<Social_linksModel> social_links, String logo, String code_of_conduct, String schedule_published_on, String background_image, CreatorModel creator, String name, Call_for_papersModel call_for_papers, String topic) {

		this._version = version;
		this.description = description;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.state = state;
		this.email = email;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this._creator = creator;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}