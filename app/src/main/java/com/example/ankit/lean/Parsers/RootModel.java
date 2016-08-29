import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String timezone;
	public String organizer_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String background_image;
	public String location_name;
	public String start_time;
	public String type;
	public String topic;
	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String organizer_description;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String end_time;
	public String state;
	public String name;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String privacy, String timezone, String organizer_name, String code_of_conduct, CopyrightModel copyright, String background_image, String location_name, String start_time, String type, String topic, String email, int id, ArrayList<Social_linksModel> social_links, String description, String organizer_description, String logo, Call_for_papersModel call_for_papers, String schedule_published_on, String end_time, String state, String name, VersionModel version) {

		this._creator = creator;
		this.privacy = privacy;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this.type = type;
		this.topic = topic;
		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.description = description;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.state = state;
		this.name = name;
		this._version = version;

	}

}