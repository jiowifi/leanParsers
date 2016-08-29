import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String code_of_conduct;
	public String type;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String schedule_published_on;
	public String background_image;
	public String description;
	public String topic;
	public String timezone;
	public String start_time;
	public String end_time;
	public String organizer_description;
	public int id;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String email;
	public String location_name;
	public VersionModel _version;
	public String privacy;

	public RootModel(CreatorModel creator, ArrayList<Social_linksModel> social_links, String state, String code_of_conduct, String type, String logo, Call_for_papersModel call_for_papers, String name, String schedule_published_on, String background_image, String description, String topic, String timezone, String start_time, String end_time, String organizer_description, int id, String organizer_name, CopyrightModel copyright, String email, String location_name, VersionModel version, String privacy) {

		this._creator = creator;
		this.social_links = social_links;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.description = description;
		this.topic = topic;
		this.timezone = timezone;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.email = email;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;

	}

}